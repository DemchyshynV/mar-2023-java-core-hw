package hw2.task1;

public class WorkStation extends Laptop{
    Video videoCard;

    public WorkStation() {
    }

    public WorkStation(int CPUs, int RAM, double monitor, int weight, Video videoCard) {
        super(CPUs, RAM, monitor, weight);
        this.videoCard = videoCard;
    }

    public Video getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(Video videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public String toString() {
        return "WorkStation{" +
                "videoCard=" + videoCard +
                "} " + super.toString();
    }
}
