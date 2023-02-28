
    public class Phone {
        private String name;
        private float price;
        private String model;
        private PhoneType phoneType;
        private boolean isRepairable;
        private boolean isExchangeable;
        private boolean isSellable;

        public Phone(String name, float price, String model, PhoneType phoneType) {
            this.name = name;
            this.price = price;
            this.model = model;
            this.phoneType = phoneType;
        }

        public void repair() {
            this.isRepairable = true;
            System.out.println("phone repair");
        }

        public void exchange() {
            this.isExchangeable = true;
            System.out.println("phone exchanged");
        }

        public void sell() {
            this.isSellable = true;
            System.out.println("phone selled");
        }

        // getters and setters
        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getModel() {
            return model;
        }

        public PhoneType getPhoneType() {
            return phoneType;
        }


        public java.lang.String toString() {
            return "Phone{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", model='" + model + '\'' +
                    ", phoneType=" + phoneType +
                    '}';
        }
    }

