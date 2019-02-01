import {Component, EventEmitter, Input, OnChanges, OnInit, Output, SimpleChanges, ViewChild} from '@angular/core';
import {AppService} from '../app.service';
import {MatPaginator, MatTableDataSource} from '@angular/material';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.scss']
})
export class EmployeeComponent implements OnInit, OnChanges {
   @Input() employees: Employee[];
  @Output() DeleteEvent = new EventEmitter();
  @Output() ViewEvent = new EventEmitter();
  @Output() EditEvent = new EventEmitter();
  @ViewChild(MatPaginator) paginator: MatPaginator;
  empTable = new MatTableDataSource();
  displayedColumns: string[] = ['View', 'Edit', 'empID', 'empName', 'empActive', 'Department', 'Delete'];
  constructor( ) { }

  ngOnInit() {
    console.log(this.employees)
    this.empTable.paginator = this.paginator;
    this.empTable.data = this.employees;
  }

  ngOnChanges(changes: SimpleChanges) {
    this.empTable.data = this.employees;
  }

  deleteEmployee(id: number) {
    console.log(id);
    this.DeleteEvent.emit(id);
  }

  viewEmployee(id: number) {
    this.ViewEvent.emit(id);
  }

  editEmployee(id: number) {
    this.EditEvent.emit(id);
  }

  updateManualPage(index) {
    this.paginator.pageIndex = index;
    this.ngOnInit();
  }
}
