package org.mxhc;

import org.mxhc.department.Department;
import org.mxhc.department.FinancialDepartment;
import org.mxhc.department.HeadDepartment;
import org.mxhc.department.SalesDepartment;

import java.util.ArrayList;
import java.util.List;

public class CompositeDemo {
    public static void main(String[] args) {
        SalesDepartment sd = new SalesDepartment();
        SalesDepartment sd1 = new SalesDepartment();
    
        FinancialDepartment fd = new FinancialDepartment();
        FinancialDepartment fd1 = new FinancialDepartment();
    
        List<Department> deps = new ArrayList<>();
        deps.add(sd1);
        deps.add(sd);
        deps.add(fd);
    
        HeadDepartment hd = new HeadDepartment(deps);
        
        HeadDepartment hd1 = new HeadDepartment(List.of(fd1));
        
        hd.add(hd1);
        
        hd.printName();
    }
}