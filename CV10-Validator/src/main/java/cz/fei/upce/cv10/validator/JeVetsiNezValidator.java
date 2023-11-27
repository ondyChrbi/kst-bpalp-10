package cz.fei.upce.cv10.validator;

public class JeVetsiNezValidator implements Validator {
    private final String jmenoParametru;
    private final int validovaneCislo;
    private final int spodniHranice;

    public JeVetsiNezValidator(String jmenoParametru, int validovaneCislo, int spodniHranice) {
        this.jmenoParametru = jmenoParametru;
        this.validovaneCislo = validovaneCislo;
        this.spodniHranice = spodniHranice;
    }
    
    @Override
    public boolean validuj() {
        return this.getValidovaneCislo() > this.getSpodniHranice();
    }

    @Override
    public String dejChybovouHlasku() {
        if (this.validuj()) {
            return "Parameter je validni";
        }
        
        return this.getJmenoParametru() + " je mensi nebo rovno nez " 
                + this.getSpodniHranice();
    }

    public String getJmenoParametru() {
        return jmenoParametru;
    }

    public int getValidovaneCislo() {
        return validovaneCislo;
    }

    public int getSpodniHranice() {
        return spodniHranice;
    }
}
