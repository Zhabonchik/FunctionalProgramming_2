
/*12.	Получить из набора предприятий список пар <название типа производства;
список цехов, которые непосредственно используют продукцию данного типа производства>.*/

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {
    public static void main(String args[]) {
        Manufacture manufacture1 = new Manufacture("нитки", 10, 12);
        Manufacture manufacture2 = new Manufacture("кожа", 100, 110);
        Manufacture manufacture3 = new Manufacture("провода", 19, 34);
        Manufacture manufacture4 = new Manufacture("микросхемы", 40, 40);
        Manufacture manufacture5 = new Manufacture("дисплеи", 3, 120);
        Department department1 = new Department("смартфоны", new ArrayList<>(Arrays.asList("department2")), new ArrayList<>(Arrays.asList(manufacture3, manufacture4, manufacture5)));
        Department department2 = new Department("куртки", new ArrayList<>(Arrays.asList("department3")), new ArrayList<>(Arrays.asList(manufacture1, manufacture2)));
        Department department3 = new Department("обувь", new ArrayList<>(Arrays.asList("department1", "department4")), new ArrayList<>(Arrays.asList(manufacture2)));
        Department department4 = new Department("электрические чайники", new ArrayList<>(Arrays.asList("department2", "department3")), new ArrayList<>(Arrays.asList(manufacture3, manufacture4)));
        Company company = new Company("RomanReigns inc.", new ArrayList<>(Arrays.asList(department1, department2, department3, department4)));
        System.out.println(company);
        Map<String, List<Department>> map = company.getDepartmentList().stream().flatMap(department -> department.getDepartmentsAndManufacture().stream())
                .collect(Collectors.groupingBy(DepartmentAndManufacture::getManufacture, Collectors.mapping(DepartmentAndManufacture::getDepartment, Collectors.toList())));
        for (Map.Entry<String, List<Department>> x : map.entrySet()) {
            System.out.println(x.getKey() + ": ");
            System.out.println(x.getValue());
        }
    }
}

/*RomanReigns inc.[смартфоны[department2][провода 19 34, микросхемы 40 40, дисплеи 3 120],
куртки[department3][нитки 10 12, кожа 100 110], обувь[department1, department4][кожа 100 110],
 электрические чайники[department2, department3][провода 19 34, микросхемы 40 40]]*/