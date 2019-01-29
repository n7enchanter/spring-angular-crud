import { Component, OnInit } from '@angular/core';
import {AppService} from '../app.service';
import { Router} from '@angular/router';
import {MatDialogRef} from '@angular/material';

@Component({
  selector: 'app-employee-detail',
  templateUrl: './employee-detail.component.html',
  styleUrls: ['./employee-detail.component.css']
})
export class EmployeeDetailComponent implements OnInit {
  departmentList: Department[];
  employee: Employee = new class implements Employee {
    empActive: boolean;
    empID: number;
    empName: String;
    department: Department;
  };
  department: Department = new class implements Department {
    depID: number;
    depName: String;
  }
  isView: any = false;
  constructor(private app: AppService, public dialogRef: MatDialogRef<EmployeeDetailComponent> , private rout: Router) { }

  ngOnInit() {
    this.isView = this.app.isView;
    this.app.getDepartments().subscribe((dep: Department[]) =>
    this.departmentList = dep
    );
  }

  submit() {
    this.employee.empName = this.app.form.value.empName;
    this.employee.empActive = this.app.form.value.empActive;
    this.department.depID = this.app.form.value.department;
    this.employee.department = this.department;
    this.app.saveUpdateEmployee(this.employee).subscribe()
    //this.rout.navigate(['employees']);
    this.onClose();

  }

  onClose() {
    this.app.form.reset();
    this.dialogRef.close();
  }

  onClear() {
    this.app.form.reset();
    this.onClose();
  }



}
