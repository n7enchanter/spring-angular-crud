import { Component, OnInit } from '@angular/core';
import {AppService} from '../app.service';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {MatDialog, MatDialogConfig} from '@angular/material';
import {EmployeeDetailComponent} from '../employee-detail/employee-detail.component';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.scss']
})
export class EmployeeListComponent implements OnInit {
  employeeList: Employee[];
  str: string;
  isView: any = false;
  showData = false;
  form = new FormGroup({
    empName: new FormControl('', Validators.required),
  });
  constructor( private app: AppService, private dialog: MatDialog) { }

  ngOnInit() {
    this.getAll();
  }

  getAll() {
    this.app.getAll().subscribe((data: Employee[] ) => {
      this.employeeList = data;
      this.showData = true;
    });
  }

  editEmployee(id: number) {
    this.isView = false;
    this.app.isView = false;
    this.app.form.enable();
    console.log(this.isView)
    const dialogConfig = new MatDialogConfig;
    dialogConfig.width = '60%';
    this.app.getById(id).subscribe((data: Employee) => {
      this.populateOnEdit(data);
    });
    this.dialog.open(EmployeeDetailComponent, dialogConfig);
  }
  viewEmployee(id: number) {
    this.isView = true;
    this.app.isView = true;
    this.app.form.disable();
    console.log(this.isView)
    const dialogConfig = new MatDialogConfig;
    dialogConfig.width = '60%';
    this.app.getById(id).subscribe((data: Employee) => {
      this.populateOnEdit(data);
    });
    this.dialog.open(EmployeeDetailComponent, dialogConfig);
  }

  deleteEmployee(id: number) {
    console.log(id);
    this.app.deleteById(id).subscribe(() => {
      this.getAll();
    });
  }

  searchEmployee() {
    this.app.searchEmployee(this.form.value.empName).subscribe( (data: Employee[]) =>
    this.employeeList = data);
  }

  save() {
    this.searchEmployee();
  }
  cancel() {
    this.form.reset();
    this.getAll();
  }

  onCreate() {
    this.app.isView = false;
    this.app.form.reset();
    this.app.form.enable();
    const dialogConfig = new MatDialogConfig;
    dialogConfig.width = '60%';
    this.dialog.open(EmployeeDetailComponent, dialogConfig);
  }


  populateOnEdit(employee: Employee) {
    console.log(employee.department.depID)
    this.app.form.setValue({
      empID: employee.empID,
      empName: employee.empName,
      empActive: employee.empActive,
      department: employee.department.depID
    });
    console.log((this.app.form.get('department')));
  }

}
