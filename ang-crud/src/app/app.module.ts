import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {
  MatButton,
  MatButtonModule,
  MatCheckboxModule, MatDialogModule, MatFormFieldModule, MatGridList, MatGridListModule, MatIconModule, MatInputModule,
  MatListModule, MatMenuModule, MatOptionModule,
  MatPaginator, MatPaginatorModule, MatProgressSpinnerModule, MatSelectModule, MatSortModule,
  MatTableModule,
  MatToolbar,
  MatToolbarModule
} from '@angular/material';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EmployeeDetailComponent } from './employee-detail/employee-detail.component';
import {AppRoutingModule} from './app-routing.module';
import {AppService} from './app.service';
import {FormsModule, NgModel, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    EmployeeListComponent,
    EmployeeDetailComponent,


  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule,
    HttpClientModule,
    MatButtonModule,
    MatListModule,
    MatCheckboxModule,
    MatToolbarModule,
    MatIconModule,
    MatMenuModule,
    MatInputModule,
    MatProgressSpinnerModule,
    MatTableModule,
    MatPaginatorModule,
    MatSelectModule,
    MatSortModule,
    MatDialogModule,
    ReactiveFormsModule,
    MatGridListModule,
    MatFormFieldModule,
    MatCheckboxModule,
    MatOptionModule

  ],
  providers: [AppService],
  bootstrap: [AppComponent]
})
export class AppModule { }
