package studentcampussystem;

public class ServiceRequest {

    private String studentId;
    private String request;

    public ServiceRequest(
            String studentId,
            String request) {

        this.studentId = studentId;
        this.request = request;
    }
}