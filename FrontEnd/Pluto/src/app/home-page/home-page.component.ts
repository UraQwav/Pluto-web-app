import { Component, OnInit, AfterViewInit, AfterContentInit } from '@angular/core';
import { timeout, delay } from 'q';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit, AfterViewInit,AfterContentInit{

  isLoad: boolean = false;
  isNotLoad: boolean = true;
  constructor() { }

  ngOnInit(): void {
    
  }
  ngAfterViewInit(): void{
    setTimeout(()=>{this.isLoad = true; this.isNotLoad = false;}, 500);
  }
  ngAfterContentInit(): void{
    
  }
}
