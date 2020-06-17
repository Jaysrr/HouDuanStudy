package class03;

import java.util.Date;

/**
 * @program: HouDuanStudy
 * @description:
 * @author: Jaysrr
 * @create: 2020-06-17 22:00
 **/
public class Test {
    public static void main(String[] args) {
        MicroPhone appleMP = new MicroPhone();
        appleMP.setId(7);
        appleMP.setSize(15);
        appleMP.setVolume(100);
        appleMP.setWireless(true);
        System.out.println(appleMP);

        MicroPhone huaweiMP = new MicroPhone();
        huaweiMP.setId(15);
        huaweiMP.setSize(10);
        huaweiMP.setVolume(88);
        huaweiMP.setWireless(false);
        System.out.println(huaweiMP);
        System.out.println();

        Singer lizhi = new Singer();
        lizhi.setId(6);
        lizhi.setAge(35);
        lizhi.setName("李志");
        lizhi.setRole("摇滚主唱");
        System.out.println(lizhi);

        Singer chenyixun = new Singer();
        chenyixun.setId(2);
        chenyixun.setAge(42);
        chenyixun.setName("陈奕迅");
        chenyixun.setRole("鼓手");
        System.out.println(chenyixun);
        System.out.println();

        Band rockandRole = new Band();
        rockandRole.setBandName("摇就完事");
        rockandRole.setId(1);
        rockandRole.setStartTime(new Date());
        System.out.println(rockandRole);

        Band bsb = new Band();
        bsb.setBandName("后街男孩");
        bsb.setId(2);
        bsb.setStartTime(new Date());
        System.out.println(rockandRole);
        System.out.println();

        /**话筒和歌手的关系 1..1*/
        MPAndSinger huaweiAndLizhi = new MPAndSinger();
        huaweiAndLizhi.setId(1);
        huaweiAndLizhi.setMphoneId(huaweiMP.getId());
        huaweiAndLizhi.setSingId(lizhi.getId());
        System.out.println(huaweiAndLizhi);

        MPAndSinger appleAndChen= new MPAndSinger();
        appleAndChen.setId(2);
        appleAndChen.setMphoneId(appleAndChen.getId());
        appleAndChen.setSingId(chenyixun.getId());
        System.out.println(appleAndChen);
        System.out.println();

        /**歌手和乐队的关系 1..n*/
        SingerAndBand singerAndBand = new SingerAndBand();
        singerAndBand.setId(1);
        singerAndBand.setSingerId(lizhi.getId());
        singerAndBand.setSingerId(chenyixun.getId());
        singerAndBand.setBandId(rockandRole.getId());
        System.out.println(singerAndBand);

        /**话筒和乐队的关系 n..n*/
        MPAndBand mpAndBand1 = new MPAndBand();
        mpAndBand1.setId(1);
        mpAndBand1.setMphoneId(huaweiMP.getId());
        mpAndBand1.setMphoneId(appleMP.getId());
        mpAndBand1.setBandId(rockandRole.getId());
        System.out.println(mpAndBand1);


        MPAndBand mpAndBand2 = new MPAndBand();
        mpAndBand2.setId(2);
        mpAndBand2.setMphoneId(appleMP.getId());
        mpAndBand2.setMphoneId(huaweiMP.getId());
        mpAndBand2.setBandId(rockandRole.getId());
        mpAndBand2.setBandId(bsb.getId());
//        System.out.println(mpAndBand2);


    }
}
