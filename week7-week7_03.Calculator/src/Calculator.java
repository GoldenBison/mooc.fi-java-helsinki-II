public class Calculator {
    private Reader reader;
    
    public Calculator() {
        reader = new Reader();
    }
    
    private void sum() {
        
    }
    
    private void difference() {
        
    }
    
    private void product() {
        
    }
    
    private void statistics() {
        
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
}
