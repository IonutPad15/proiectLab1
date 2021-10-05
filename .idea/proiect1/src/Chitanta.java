import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.StringJoiner;

public class Chitanta {
    private Meniu [] _meniuri;
    private int[] _nrmeniuri;
    private double _total;
    public Chitanta(Meniu [] meniuri, int[] nrmeniuri)
    {
        _meniuri = meniuri;
        _nrmeniuri = nrmeniuri;
        _total = 0;
    }
    public StringJoiner generareChitanta(int optiune)
    {
        if(optiune == 1)
        {
            StringJoiner rez= new StringJoiner("");
            rez.add( "         The Forest Man         \n   Str 1.Decembrie 1918, Nr.15  \n");
            rez.add ("    Ludus / Oras Ludus/ Mures  \n             VANZARE\n====================================\n");
            rez.add ("DATA             ");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            rez.add(dtf.format(now) +"\n");
            _total = 0;
            for(int i = 0; i < 4; ++i)
            {
                if(_nrmeniuri[i] > 0) {
                    rez.add(_nrmeniuri[i] + "x" + _meniuri[i].getNumemeniu()) ;
                    rez.add("          Pret: " + _nrmeniuri[i] * _meniuri[i].getPret() + " lei\n");
                    _total += _nrmeniuri[i] * _meniuri[i].getPret();
                }
            }
            rez.add("Total:                     " + _total + " lei");
            return rez;
        }
        else if (optiune == 2)
        {
            StringJoiner rez = new StringJoiner("");
            rez.add("   Pret: ");
            double total = 0;
            for(int i = 0; i < 4; ++i) {
                total+=_nrmeniuri[i] * _meniuri[i].getPret() ;
            }
            rez.add(total + " lei");
            return rez;
        }
        else{
            StringJoiner rez = new StringJoiner("");
            rez.add("Optiune invalida");
            return rez;
        }
    }
    public void setMeniuri(Meniu[] meniuri) {
        _meniuri = meniuri;
    }
    public void set_nrmeniuri(int[] nrmeniuri)
    {
        _nrmeniuri = nrmeniuri;
    }
    public Meniu[] getMeniuri()
    {
        return _meniuri;
    }
    public String toString(){
        String rez = "Meniuri:";
        for(int i = 0; i < 4; ++i) {
            rez+=_nrmeniuri[i] + "x" + _meniuri[i].toString();
        }
        return rez;
    }
}
