public class Task4
{
    private double x = 0.0;
    private double y = 0.0;
    private double z = 0.0;

    public Task4(double X, double Y, double Z)
    {
        this.x = X;
        this.y = Y;
        this.z = Z;
    }

    public double vectorLength(double x1, double y1, double z1)
    {
        return Math.sqrt((x1*x1)+(y1*y1)+(z1*z1));
    }

    public double scalarProduct(double x1, double y1, double z1)
    {
        return (x*x1+y*y1+z*z1);
    }

    public Task4 vectorProduct(double x1, double y1, double z1)
    {
        return new Task4(y*z1-z*y1,z*x1-x*z1,x*y1-y*x1);
    }

    /*
    public double vectorsAngle(Task4 a, Task4 b)
    {
        return ();
    }
*/


}
