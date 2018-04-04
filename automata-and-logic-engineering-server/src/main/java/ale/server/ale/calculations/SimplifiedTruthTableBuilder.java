package ale.server.ale.calculations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimplifiedTruthTableBuilder {

    private List<Map<Character, Integer>> unsimplifiedTruthTable;

    SimplifiedTruthTableBuilder(List<Map<Character, Integer>> truthTable) {

        unsimplifiedTruthTable = truthTable;
    }

    public List<Map<Character, Character>> simplifyTruthTable() {
        List<Map<Character, Character>> simplifiedTruthTable = new ArrayList<>();
        for (int i = 0; i < unsimplifiedTruthTable.size() - 1; i++) {
            for (int j = i + 1; j < unsimplifiedTruthTable.size(); j++) {
                simplifiedTruthTable.get(i)
            }

        }

        for (Map<Character, Integer> tableRow : unsimplifiedTruthTable) {

        }

        return null;
    }

    /**
     * Retrieves the rows that evaluate to true
     */
    private List<Map<Character, Character>> getTrueResultsFromTruthTable() {
        List<Map<Character, Character>> unsimplifiedTruthTableWithTrueResults = new ArrayList<>();

        for (Map<Character, Integer> tableRow : unsimplifiedTruthTable) {
            if (tableRow.get('=') == 1) {


                Map<Character, Character>
                unsimplifiedTruthTableWithTrueResults.add(()tableRow);
            }
        }
    }


    private List<Map<Character, Character>> convertTruthTableType(List<Map<Character, Integer>> truthTable) {
        List<Map<Character, Character>> convertedTruthTable = new ArrayList<>();

        for (Map<Character, Integer> tableRow : truthTable) {

            Map<Character, Character> convertedMap = new HashMap<>();
            for (Map.Entry<Character, Integer> entry : tableRow.entrySet()) {
                convertedMap.put(entry.getKey(), (char) ((int) entry.getValue()));
            }
            convertedTruthTable.add(convertedMap);
        }
        return convertedTruthTable;
    }

    private boolean areRowsSimplifiable(Map<Character, Integer> rowOne, Map<Character, Integer> rowTwo) {
        return false;
    }


}
