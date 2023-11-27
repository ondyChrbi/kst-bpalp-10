package cz.fei.upce.cv10.validator;

public class ValidatorApp {

    public static void main(String[] args) {
        Validator[] validatory = new Validator[]{
            new NeniZapornyValidator(
            1,
            "vekUzivatele"
            ),
            new JeVetsiNezValidator(
            "rozlohaPozemku",
            2000,
            2500
            ),
            new RetezecNeniPrazdnyValidator(
                    "username",
                    "ondyChrbi"
            )
        };

        for (Validator validator : validatory) {
            System.out.println(validator.validuj());
            System.out.println(validator.dejChybovouHlasku());
        }
    }
}
