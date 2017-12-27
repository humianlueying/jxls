package cc.geoworks.wscs.entity;
public class SwcPpms {
    private String pid;//唯一编码
    private String stcd;//测站编码
    private String dt;//月份
    private Double mp;//月降水量
    private Double mpd;//月降水日数
    private Double mmxp;//月最大日降水量
    private String nt;//备注
    private java.util.Date moditime;//时间戳
    public SwcPpms() {
        super();
    }
    public SwcPpms(String pid,String stcd,String dt,Double mp,Double mpd,Double mmxp,String nt,java.util.Date moditime) {
        super();
        this.pid = pid;
        this.stcd = stcd;
        this.dt = dt;
        this.mp = mp;
        this.mpd = mpd;
        this.mmxp = mmxp;
        this.nt = nt;
        this.moditime = moditime;
    }
    public String getPid() {
        return this.pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getStcd() {
        return this.stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    public String getDt() {
        return this.dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Double getMp() {
        return this.mp;
    }

    public void setMp(Double mp) {
        this.mp = mp;
    }

    public Double getMpd() {
        return this.mpd;
    }

    public void setMpd(Double mpd) {
        this.mpd = mpd;
    }

    public Double getMmxp() {
        return this.mmxp;
    }

    public void setMmxp(Double mmxp) {
        this.mmxp = mmxp;
    }

    public String getNt() {
        return this.nt;
    }

    public void setNt(String nt) {
        this.nt = nt;
    }

    public java.util.Date getModitime() {
        return this.moditime;
    }

    public void setModitime(java.util.Date moditime) {
        this.moditime = moditime;
    }

}
