package com.platzi.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {

    CLIArguments(){

    }


    @Parameter(
            required = true,
            descriptionKey = "KEYWORD",
            validateWith = CLIKeywordValidator.class,
            description = "KEYWORD"
    )
    private String  keyword;

    @Parameter(
            names = {"--location", "-l"},
            description = "Cada busueda puede incluir una ubicacion"
    )
    private String  location;

    @Parameter(
            names = {"--page", "-p"},
            description = "La api devuelve 50 resultados, usa un numero para la pagina"
    )
    private int page = 0;

    @Parameter(
            names = {"--full-time"},
            description = "agregar si queremos trabajos de tiempo completo"
    )
    private boolean isFullTime = false;

    @Parameter(
            names = {"--markdown"},
            description = "Obtener los resultados en markdown"
    )
    private boolean isMarkdown = false;

    @Parameter(
            names = {"--help"},
            help = true,
            validateWith = CLIHelpValidator.class,
            description = "mostrar la ayuda"
    )
    private boolean isHealp;







    public String getKeyword() {
        return keyword;
    }

    public String getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public boolean isMarkdown() {
        return isMarkdown;
    }

    public boolean isHealp() {
        return isHealp;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkdown=" + isMarkdown +
                ", isHealp=" + isHealp +
                '}';
    }

    public static CLIArguments newInstance(){
        return new CLIArguments();
    }
}
