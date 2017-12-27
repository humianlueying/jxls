package cc.geoworks.wscs.entity.table;

import java.util.Calendar;
import java.util.Collection;
import java.util.LinkedHashMap;

public class MdBase {
    private LinkedHashMap<Integer, DataRecord> dataHash;

    public MdBase(LinkedHashMap<Integer, DataRecord> dataHash) {
        this.dataHash = dataHash;
    }

    public MdBase(int count) {
        this.dataHash = new LinkedHashMap<>();
        for (int i = 1; i <= count; i++) {
            this.dataHash.put(i, new DataRecord());
        }
    }

    public Collection<DataRecord> getValues(){
        return this.dataHash.values();
    }

    public LinkedHashMap<Integer, DataRecord> getData(){
        return this.dataHash;
    }

    public void setData(int month, int day, String data) {
        this.dataHash.get(day).setData(month, data);
    }

    public class DataRecord {
        private String jan = "";
        private String feb = "";
        private String mar = "";
        private String apr = "";
        private String may = "";
        private String jun = "";
        private String jul = "";
        private String aug = "";
        private String sept = "";
        private String oct = "";
        private String nov = "";
        private String dec = "";

        void setData(int month, String data) {
            switch (month) {
                case Calendar.JANUARY:
                    setJan(data);
                    break;
                case Calendar.FEBRUARY:
                    setFeb(data);
                    break;
                case Calendar.MARCH:
                    setMar(data);
                    break;
                case Calendar.APRIL:
                    setApr(data);
                    break;
                case Calendar.MAY:
                    setMay(data);
                    break;
                case Calendar.JUNE:
                    setJan(data);
                    break;
                case Calendar.JULY:
                    setJul(data);
                    break;
                case Calendar.AUGUST:
                    setAug(data);
                    break;
                case Calendar.SEPTEMBER:
                    setSept(data);
                    break;
                case Calendar.OCTOBER:
                    setOct(data);
                    break;
                case Calendar.NOVEMBER:
                    setNov(data);
                    break;
                case Calendar.DECEMBER:
                    setDec(data);
                    break;
            }
        }

        public String getJan() {
            return jan;
        }

        public void setJan(String jan) {
            this.jan = jan;
        }

        public String getFeb() {
            return feb;
        }

        void setFeb(String feb) {
            this.feb = feb;
        }

        public String getMar() {
            return mar;
        }

        void setMar(String mar) {
            this.mar = mar;
        }

        public String getApr() {
            return apr;
        }

        void setApr(String apr) {
            this.apr = apr;
        }

        public String getMay() {
            return may;
        }

        void setMay(String may) {
            this.may = may;
        }

        public String getJun() {
            return jun;
        }

        void setJun(String jun) {
            this.jun = jun;
        }

        public String getJul() {
            return jul;
        }

        void setJul(String jul) {
            this.jul = jul;
        }

        public String getAug() {
            return aug;
        }

        void setAug(String aug) {
            this.aug = aug;
        }

        public String getSept() {
            return sept;
        }

        void setSept(String sept) {
            this.sept = sept;
        }

        public String getOct() {
            return oct;
        }

        public void setOct(String oct) {
            this.oct = oct;
        }

        public String getNov() {
            return nov;
        }

        void setNov(String nov) {
            this.nov = nov;
        }

        public String getDec() {
            return dec;
        }

        void setDec(String dec) {
            this.dec = dec;
        }
    }
}
