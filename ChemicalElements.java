//Химические элементы.
//
//Используя возможности enum-а реализуйте метод getChemicalElementPosition,
//который должен возвращать порядковый номер химического элемента.
//Требуется вывести первые пятнадцать элементов.

public class ChemicalElements {
    public enum Elements {
        HYDROGEN("Водород"), HELIUM("Гелий"),
        LITHIUM("Литий"), BERYLLIUM("Бериллий"),
        BORON("Бор"), CARBON("Углерод"),
        NITROGEN("Азот"), OXYGEN("Кислород"),
        FLUORINE("Фтор"), NEON("Неон"),
        SODIUM("Натрий"), MAGNESIUM("Магний"),
        ALUMINIUM("Алюминий"), SILICON("Кремний"),
        PHOSPHORUS("Фосфор");

        private String nameElement;

        Elements(String nameElement) {
            this.nameElement = nameElement;
        }

        public String getNameElement() {
            return nameElement;
        }

        public void setNameElement(String nameElement) {
            this.nameElement = nameElement;
        }

        int getChemicalElementPosition() {
            return this.ordinal() + 1;
        }
    }

    public static void main(String[] args) {
        for (Elements element : Elements.values()) {
            System.out.println("Порядковый номер элемента \"" + element.getNameElement() +
                    "\" = " + element.getChemicalElementPosition());
        }
    }
}
