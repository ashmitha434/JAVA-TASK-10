public class Tea {
        public void prepareTea() {
            System.out.println("Preparing basic tea with hot water and tea leaves.");
        }
    
        public void addMilk() {
            System.out.println("Adding milk to the tea.");
        }
    
        public void addSugar() {
            System.out.println("Adding sugar to the tea.");
        }
    
        public static void main(String[] args) {
            Tea[] teas = new Tea[3];
            teas[0] = new BlackTea();
            teas[1] = new GreenTea();
            teas[2] = new HerbalTea();
    
            for (Tea tea : teas) {
                tea.prepareTea();
                tea.addMilk(); // All teas have milk added
                tea.addSugar(); // All teas have sugar added
                System.out.println();
            }
        }
    }
    
    class BlackTea extends Tea {
        @Override
        public void prepareTea() {
            System.out.println("Preparing black tea with hot water and black tea leaves.");
        }
    }
    
    class GreenTea extends Tea {
        @Override
        public void prepareTea() {
            System.out.println("Preparing green tea with hot water and green tea leaves.");
        }
    }
    
    class HerbalTea extends Tea {
        @Override
        public void prepareTea() {
            System.out.println("Preparing herbal tea with hot water and herbal tea leaves.");
        }
    }
    

    
    

