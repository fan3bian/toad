import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {

    public static void main(String[] args) {


        String[] all = {
                "202V25919-0013","200V90490-0051","080V05504-6096","WG9720760003","201V03901-0402","WG9525230001","190007301050+001","NZ9525230203","WG1671210059","102024011","WG9720760001","KC1626456052","AZ9007300101+001","190007301050+002","712W63730-0032","KC1626456053","AZ9516470010","WG1664340009","SZ9120770255","MQ9-11060-0803+011","WG9925551742","712W46601-7012","712W61942-0012","AZ9525581011","NZ9525820113","MQ9-11060-0805+011","102017034","WG9000360366","AZ9007300102+002","812W62410-0089-387","WG1664340408","WG1664340008","103001030","LG1034131281","WG1664235006","WG9716270004","812W62410-0090-387","WG9525771677","TG53715100220","812W97100-6187Z","MQ9-11060-0808+011","WG9007300029+012","NZ9525820014","812W61960-0009","MQ9-11060-0806+011","HW25716XACL160911","WG9720760007","AZ9007300011+001","WG1664166500","812W61510-6007","WG1664345013","AZ1662511016","MQ9-10010-0002+003","AZ1662511074","102050005","BZ53718200041","WG9725520788+003","190007301050+005","NZ9525820110"
        };
        String[] split ={
                "080V05504-6096","202V25919-0013","AZ9007300101+001","190007301050+002","SZ9120770255","WG9720760001","KC1626456052","WG1671210059","NZ9525230203","190007301050+001","WG9525230001","201V03901-0402","WG9720760003","200V90490-0051","MQ9-11060-0805+011","MQ9-11060-0806+011","MQ9-11060-0803+011","WG1664235006","812W61960-0009","NZ9525820014","AZ9525581011","WG9007300029+012","WG1664340408","712W61942-0012","TG53715100220","WG9000360366","812W62410-0090-387","WG1664340008","WG1664340009","MQ9-11060-0808+011","812W97100-6187Z","WG9525771677"
        };

        List<String> dbs = Arrays.asList(split);
        List<String> unContains = Arrays.stream(all).filter(x -> !dbs.contains(x)).collect(Collectors.toList());
//        List<String> contains = Arrays.stream(all).filter(x -> dbs.contains(x)).collect(Collectors.toList());
//        System.out.println(all.length);
//        System.out.println(split.length);
        System.out.println(unContains);
//        System.out.println(collect.size());
    }

    @Test
    public void test() {
        String[] a = {

        };
        String[] b = {

        };

        List<String> aList = Arrays.asList(a);
        List<String> bList = Arrays.asList(b);
        HashSet<String> strings = new HashSet<>();
        List<String> unContains = bList.stream().filter(x -> !aList.contains(x)).collect(Collectors.toList());
        System.out.println(unContains.size());
        System.out.println("--\n");
        List<String> contains = bList.stream().filter(x -> aList.contains(x)).collect(Collectors.toList());
        System.out.println(contains);

    }
}
