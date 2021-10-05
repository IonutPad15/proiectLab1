public class Produs {
    private String _numeProdus, _unitatemasura;
    private int _gramaj, _nrprod;
    public Produs(String numeProdus, int gramaj, String unitatemasura, int nrprod){
        _numeProdus = numeProdus;
        _gramaj = gramaj;
        _unitatemasura = unitatemasura;
        _nrprod = nrprod;
    }
    public String getNumeProdus() {
        return _numeProdus;
    }
    public String getUnitatemasura() {
        return _unitatemasura;
    }
    public int getGramaj()
    {
        return _gramaj;
    }
    public void setNumeProdus(String numeProdus) {
        this._numeProdus = numeProdus;
    }
    public void setUnitatemasura(String unitatemasura) {
        this._unitatemasura = unitatemasura;
    }
    public void setGramaj(int gramaj) {
        this._gramaj = gramaj;
    }
    public int getNrprod() {
        return _nrprod;
    }
    public void setNrprod(int _nrprod) {
        this._nrprod = _nrprod;
    }
    public String toString(){
        String rez = "Produs:" + getNrprod() + "x" + getNumeProdus() + " " +getGramaj() + getUnitatemasura();
        return rez;
    }
}
