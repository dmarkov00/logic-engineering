package ale.server.controllers;

import ale.server.ale.calculations.assignments.AssignmentOne;
import ale.server.models.AssignmentOneResult;
import ale.server.models.Formula;
import org.springframework.web.bind.annotation.*;
import java.io.UnsupportedEncodingException;

@RestController
public class AssignmentController {

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(path = "/calculate/{nr}")
    public AssignmentOneResult calculateResult(@PathVariable("nr") long assignmentNr, @RequestBody Formula formula)

    {
        String parsedFormula = "";
        try {
            parsedFormula = java.net.URLDecoder.decode(formula.getFormula(), "UTF-8");
            System.out.println(parsedFormula);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        AssignmentOneResult result = AssignmentOne.getAssignmentOneResult(parsedFormula);

        return result;
    }

}

