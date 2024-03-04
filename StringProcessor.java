public class StringProcessor {
    private String inputText;
    private StringBuilder resultText;


    public StringProcessor(String inputText) {
        this.inputText = inputText;
        this.resultText = new StringBuilder(processText());
    }


    public String processText() {
        StringBuilder result = new StringBuilder();
        String[] words = inputText.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty() && Character.isUpperCase(word.charAt(0))) {
                result.append(word).append(", ");
            }
        }


        if (result.length() > 0) {
            result.delete(result.length() - 2, result.length());
        }

        return result.toString();
    }


    public String getInputText() {
        return inputText;
    }


    public String getResultText() {
        return resultText.toString();
    }
}
