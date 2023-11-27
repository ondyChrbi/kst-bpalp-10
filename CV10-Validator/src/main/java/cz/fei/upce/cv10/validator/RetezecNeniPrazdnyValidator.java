package cz.fei.upce.cv10.validator;

public class RetezecNeniPrazdnyValidator implements Validator{
    private final String jmenoParametru;
    private final String validovanyRetezec;

    public RetezecNeniPrazdnyValidator(String jmenoParametru, String validovanyRetezec) {
        this.jmenoParametru = jmenoParametru;
        this.validovanyRetezec = validovanyRetezec;
    }
    
    @Override
    public boolean validuj() {
        return !this.getValidovanyRetezec().isBlank();
    }

    @Override
    public String dejChybovouHlasku() {
        if (this.validuj()) {
            return "Parameter je validni";
        }
        
        return this.getJmenoParametru() + " je prazdny retezec";
    }

    public String getJmenoParametru() {
        return jmenoParametru;
    }

    public String getValidovanyRetezec() {
        return validovanyRetezec;
    }
    
    
}
