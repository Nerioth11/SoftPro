package softpro.Persistence.Database;

import java.util.List;
import java.util.Map;

public interface BDInterface {

    public List<String> selectFrom(String table, String[] params);

    public List<String> selectFrom(String table, String[] params, String where);

    public boolean insertInto(String table, Map<String, Object> mapa);

    public boolean update(String table, Map<String, Object> mapa, String where);

    public boolean deleteFrom(String table, String where);

}
