import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class AppService {
isView: any = true;
constructor(private _http: HttpClient) { }
  private baseUrl = 'http://localhost:8090/';
  form: FormGroup = new FormGroup({
    empID: new FormControl(),
    empName: new FormControl( Validators.required),
    empActive: new FormControl(),
    department: new FormControl()
  });

  getDepartments() {
    return this._http.get(this.baseUrl + 'departments/');
  }

  getAll() {
    return this._http.get(this.baseUrl + 'employees/');
  }

  getById(id: number) {
    return this._http.get(this.baseUrl + 'employee/' + id);
  }

  deleteById(id: number) {
    return this._http.delete(this.baseUrl + 'employee/' + id);
  }

  saveUpdateEmployee(employee: Employee) {
    return this._http.post(this.baseUrl + 'employee/add', employee);
  }

  searchEmployee(searchCondition: string) {
    return this._http.get(this.baseUrl + 'employee/search/' + searchCondition);
  }



}
