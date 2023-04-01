package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"
        },
        features = "src/test/resources/features"  ,
        glue =    "stepdefinitions",
        tags = "@qestit",
        dryRun=false

)
public class Runner {
/*
Cucmber de Runner Class i bos bir class tir
Runner class ini diger classslardan farkli kilan ve test NG deki xml dosyalari gibi
calismasini saglayan iki adet notasyon mevcuttur
@Runwith notasyonu projemize cucumber junit dependency eklememizin sebebidir
bu sayede runner class larimiz cucumber ile calisir

@CucumberOptions rotasyonu ile istedigimiz ozellikleri
Runner class ina ekleyebiliriz
Ancak
oncelikli görevi feature dosyalari ile stepdefinitionsda bulunann
Java methodlarimini ilisiklendirmektir

tags : features classsoru icerisinde yazilans tag (lari) aratip
buldugu tüm feature ve senaryolari calistirir

dryRun :  iki deger alabiulir
true : secilirse, verilen tag ile isaretli olan Feature veya Scenario daki
eksik stepdefinitions lari bulup
iligili mmethodlari olusturur
hicbir sekilde testimizi calistirmaz
eksik adim yoksa etest passed olarak isaretler c

false: secilirse varilen tag ile isaretlenen feature
veya senaryolari calistirir


 */




}
