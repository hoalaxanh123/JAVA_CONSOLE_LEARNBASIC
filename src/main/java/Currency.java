public enum Currency {
    VND, USD, EURO, AVC;

    @Override
    public String toString() {
        switch (this) {
            default:
                return "Unknown";
            case EURO:
                return "EURO";
            case VND:
                return "VND";
            case USD:
                return "$";
        }
    }

    public static void main(String[] args) {
        for (Currency cr : Currency.values()) {
            System.out.println(cr);
        }
    }

}
