public class TV {

    private Channel CCTV1 = new CCTV1();
    private Channel CCTV2 = new CCTV2();

    private Channel channel;

    private void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void disCCTV1() {
        this.setChannel(CCTV1);
        this.channel.display();
    }

    public void disCCTV2() {
        this.setChannel(CCTV2);
        this.channel.display();
    }
}
