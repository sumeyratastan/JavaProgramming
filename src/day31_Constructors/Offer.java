package day31_Constructors;

public class Offer {

    public String location,companyName,jobTittle;
    public double salary;
    public boolean hasBenefit,hasPTO,isWFH,isFullTime;


    public void setInfo(String location, String companyName, String jobTittle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTittle = jobTittle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTittle='" + jobTittle + '\'' +
                ", salary=$" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
