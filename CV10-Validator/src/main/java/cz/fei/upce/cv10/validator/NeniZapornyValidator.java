package cz.fei.upce.cv10.validator;

public class NeniZapornyValidator implements Validator {
    private final int validovaneCislo;
    private final String jmenoParametru;

    public NeniZapornyValidator(int validovaneCislo, String jmenoParametru) {
        this.validovaneCislo = validovaneCislo;
        this.jmenoParametru = jmenoParametru;
    }
    
    @Override
    public boolean validuj() {
        return this.getValidovaneCislo() >= 0;
    }

    @Override
    public String dejChybovouHlasku() {
        if (this.validuj()) {
            return "Parameter je validni";
        }
        
        return this.getJmenoParametru() + " nesmí být záporný";
    }

    public int getValidovaneCislo() {
        return validovaneCislo;
    }

    public String getJmenoParametru() {
        return jmenoParametru;
    }
}
