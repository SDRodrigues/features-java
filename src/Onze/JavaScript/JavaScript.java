package Onze.JavaScript;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JavaScript {
    public static void main(String[] args) {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        var engineer = new ScriptEngineManager().getEngineByName("nashorn");
        engineer.get("print('me ajude');");
        System.out.println(engineer);
    }
}
