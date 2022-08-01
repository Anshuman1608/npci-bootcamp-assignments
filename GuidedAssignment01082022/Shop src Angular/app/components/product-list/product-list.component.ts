import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/common/product';
import { ManagementService } from 'src/app/services/management.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products : Product[]
  constructor(private service : ManagementService,
    private route : Router) { }
  formModel : Product = new Product(0,"","","",0,"",0,0,"","",0)
  ngOnInit(): void {
    this.listOfProducts()
  }

  listOfProducts(){
    this.service.getAllProduct().subscribe(data => {
      this.products = data
    })
  }
  addProduct(){
    this.route.navigateByUrl("/merchant")
  }
  gotoHome(){
    this.route.navigateByUrl("/")
  }
  addtoCart(){
    this.route.navigateByUrl("/cart")
  }

}
