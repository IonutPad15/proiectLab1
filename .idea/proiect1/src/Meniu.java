public class Meniu {
    private String _numemeniu;
    private double _pret;
    private int _nrproduse;
    private Produs[] _produse;
    public Meniu(Produs[] produse, String numemeniu, double pret, int nrproduse) {
        _produse =produse;
        _numemeniu = numemeniu;
        _pret = pret;
        _nrproduse = nrproduse;
    }
    public String getNumemeniu() {
        return _numemeniu;
    }
    public void setNumemeniu(String _numemeniu) {
        this._numemeniu = _numemeniu;
    }
    public double getPret() {
        return _pret;
    }
    public void setPret(double _pret) {
        this._pret = _pret;
    }
    public int getNrproduse() {
        return _nrproduse;
    }

    public void setNrproduse(int _nrproduse) {
        this._nrproduse = _nrproduse;
    }

    public Produs[] getProduse() {
        return _produse;
    }

    public void setProduse(Produs[] _produse) {
        this._produse = _produse;
    }
    public String detaliiMeniu()
    {
        String rez = "Meniul " + _numemeniu + " contine:\n";
        for(int i = 0; i < _nrproduse; ++i)
        {
            rez+=_produse[i].getNrprod() + "x" + _produse[i].getNumeProdus() + " " + _produse[i].getGramaj() + " " ;
            rez+=_produse[i].getUnitatemasura() + "\n";
        }
        rez+= "Pret: " + getPret();
        return rez;
    }
    public String toString()
    {
        String rez = "Meniul " + getNumemeniu() + " contine:\n";
        for(int i = 0; i < _nrproduse; ++i)
        {
            rez+= _produse[i].toString() + "\n";
        }
        rez+= "Pret: " + getPret() +" lei";
        return rez;
    }
}
