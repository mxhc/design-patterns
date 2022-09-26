package org.mxhc.department;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class HeadDepartment implements Department{
    
    private final List<Department> subdepartments;
    
    @Override
    public void printName() {
        System.out.println("This is head department.");
        for (Department d : subdepartments){
            d.printName();
        }
    }
    
    public void add(Department department){
        subdepartments.add(department);
    }
    
    public void remove(Department department){
        subdepartments.remove(department);
    }
}
