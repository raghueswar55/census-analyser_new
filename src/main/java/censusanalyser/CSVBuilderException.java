package censusanalyser;

public class CSVBuilderException extends Exception {
    enum ExceptionType {
        CSV_FILE_PROBLEM, UNABLE_TO_PARSE, PROBLEM_IN_FIELDS
    }

    ExceptionType type;

    public CSVBuilderException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public CSVBuilderException(String message, ExceptionType type, Throwable cause) {
        super(message, cause);
        this.type = type;
    }

}