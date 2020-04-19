import { Component, OnInit, AfterViewInit } from '@angular/core';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit, AfterViewInit {

  isLoad: boolean = false;
  isNotLoad: boolean = true;
  constructor() { }

  ngOnInit(): void {
    
  }
  ngAfterViewInit(): void{
    setTimeout(()=>{this.isLoad = true; this.isNotLoad = false;}, 500);
  }
}
