package app;

public class Turniket {

        public void CheckPass(Pass pass) {
            if (SystemControl.cards.containsValue(pass)) {
                if (pass.isPilging) {
                    System.out.println("Представте документы");
                }
                try {
                    pass.verifyCard();
                } catch (RuntimeException e) {
                    System.err.println(e.getMessage());
                }
            } else {
                System.err.println("Проход запрещён");

            }
        }

}
