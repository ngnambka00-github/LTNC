package Assignment_5;

public class Student extends Person{
    private Status status;

    public Student() {
        status = Status.FRESHMAN;
    }

    public Student(String name, String address, String phoneNumber, String email, Status status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String statusStr = "";
        switch (status) {
            case FRESHMAN: statusStr = "freshman"; break;
            case SOPHOMORE: statusStr = "sophomore"; break;
            case JUNIOR: statusStr = "junior"; break;
            case SENIOR: statusStr = "senior"; break;
            default: break;
        }

        return "Student{" +
                "status=" + statusStr +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
