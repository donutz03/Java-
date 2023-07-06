class Employee {
Address address;
Employee(){
    address=new Address();
} // code is tightly coupled
}

// inversion of control (IoC) design pattern
class Employee {
    Address address;
    Employee(Address address){
        this.address=address;
    } // now the code is loosely coupled
}