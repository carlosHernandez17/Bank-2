import java.util.Date;

    public class Loan {
        // Atributos
        private String currencyType;
        private double amount;
        private String noPrestamo;
        private String startDate;
        private String endDate;

        // Constructor
        public Loan(String currencyType, double amount, String noPrestamo ,String startDate, String endDate ) {
            this.currencyType = currencyType;
            this.amount = amount;
            this.noPrestamo = noPrestamo;
            this.startDate = startDate;
            this.endDate = endDate;
        }

        // Getters y Setters
        public String getCurrencyType() {
            return currencyType;
        }

        public void setCurrencyType(String currencyType) {
            this.currencyType = currencyType;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getStartDate() {
            return startDate;
        }

        public void setStartDate(String startDate) {
            this.startDate = startDate;
        }

        public String getEndDate() {
            return endDate;
        }

        public void setEndDate(String endDate) {
            this.endDate = endDate;
        }

        public String getNoPrestamo() {
            return noPrestamo;
        }

        public void setNoPrestamo(String noPrestamo) {
            this.noPrestamo = noPrestamo;
        }
    }



