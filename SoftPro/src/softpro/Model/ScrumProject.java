package softpro.Model;

import java.util.HashMap;
import java.util.Map;
import softpro.Persistence.Database.SqliteInterface;

public class ScrumProject extends Project{
    
    public ScrumProject(String name) {
        super(name);
        
    }
    
    //TODO - Check ID
    public void saveProject(){
        SqliteInterface sqliteInterface = new SqliteInterface();
        Map<String, Object> mapaValores = new HashMap<>();
        
        mapaValores.put("id", 1);
        mapaValores.put("nombre", name);
        mapaValores.put("tipo", "Scrum");
        sqliteInterface.insertInto("project", mapaValores);  
    }
}
