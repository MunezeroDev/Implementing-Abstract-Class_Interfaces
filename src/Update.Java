// implement execute from DataSource
public class Update implements DataSource{

    @Override
    public void execute() {

        System.out.println("Data has been Updated Successfuly!");
    }
}

