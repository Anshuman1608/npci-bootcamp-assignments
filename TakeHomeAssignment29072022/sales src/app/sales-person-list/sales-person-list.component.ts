import { Component, OnInit } from '@angular/core';
import { SalesPerson } from '../sales-person';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list.component.html',
  styleUrls: ['./sales-person-list.component.css']
})
export class SalesPersonListComponent implements OnInit {

  constructor() { }

  salesPersonList:SalesPerson[] = [
    new SalesPerson("Anshuman","Singh","anshumaansingh98@gmail.com",40000,5000),
    new SalesPerson("Sagar","Shukla","sagar98@gmail.com",25000,2500),
    new SalesPerson("Ajay","Bhushan","bhushanajay98@gmail.com",12578,5000),
    new SalesPerson("Shlok","Kashyap","shlokk98@gmail.com",6546,1500)
  ]
  formModel : SalesPerson = new SalesPerson("","","",0,0)

  ngOnInit(): void {
    console.log(this.formModel)
  }

  onSubmit() : void{
    this.salesPersonList.push(this.formModel)
  }

}
