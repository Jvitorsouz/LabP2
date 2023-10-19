import java.util.Comparator;
import java.util.Map;

public class AnotacaoComparator implements Comparator<String> {
    private Map<String, Anotacao> baseMap;

    public AnotacaoComparator(Map<String, Anotacao> baseMap) {
        this.baseMap = baseMap;
    }

    @Override
    public int compare(String codigo1, String codigo2) {
        Anotacao anotacao1 = baseMap.get(codigo1);
        Anotacao anotacao2 = baseMap.get(codigo2);

        int comparacaoDisciplina = anotacao1.getDisciplina().compareTo(anotacao2.getDisciplina());

        if (comparacaoDisciplina == 0) {
            return codigo1.compareTo(codigo2);
        }

        return comparacaoDisciplina;
    }
}
    
   