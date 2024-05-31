class methods {
    public void default_item() {
        System.out.println("You are getting -> ");
    }
    public String give_item(int cost) {
        if(cost >= 10) return "PEN";
        return "Not enough money";
    }
}

class gift{
    public static void main(String[] args) {
        int cost = 11;
        methods person = new methods();
        person.default_item();
        String get = person.give_item(cost);
        System.out.println(get);
    }
}
