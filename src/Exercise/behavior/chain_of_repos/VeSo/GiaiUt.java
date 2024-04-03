package behavior.chain_of_repos.VeSo;

import java.util.ArrayList;
import java.util.List;

public class GiaiUt implements IDoVeSo {
    String tenGiai;
    List<String> giaiThuongs = new ArrayList<>();

    @Override
    public String doVeSo(int soDo) {
        return null;
    }

    @Override
    public IDoVeSo giaiTiepTheo(IDoVeSo iDoVeSo) {
        return null;
    }
}
