import {Component, OnInit, ViewChild} from '@angular/core';
import {Marca} from '../../modelo/Marca';
import {
  MatCell,
  MatCellDef,
  MatColumnDef,
  MatHeaderCell, MatHeaderCellDef,
  MatHeaderRow, MatHeaderRowDef, MatRow, MatRowDef, MatTable,
  MatTableDataSource
} from '@angular/material/table';
import {MarcaService} from '../../servicio/marca.service';
import {MatSnackBar} from '@angular/material/snack-bar';
import {MatPaginator} from '@angular/material/paginator';
import {MatSort} from '@angular/material/sort';
import {RouterOutlet} from '@angular/router';

@Component({
  selector: 'app-main-marca',
  standalone: true,
  imports: [
    RouterOutlet,
    MatCell,
    MatCellDef,
    MatColumnDef,
    MatHeaderCell,
    MatHeaderRow,
    MatHeaderRowDef,
    MatRow,
    MatRowDef,
    MatTable,
    MatSort,
    MatHeaderCellDef,
    MatPaginator
  ],
  templateUrl: './main-marca.component.html',
  styleUrl: './main-marca.component.css'
})
export class MainMarcaComponent implements OnInit {
      dataSource!: MatTableDataSource<Marca>;
      displayedColumns= [
       {def:'idMarca', label:'idMarca', hide:true},
       {def:'nombre', label:'nombre', hide:true},
       {def:'accion', label:'action', hide:false},
      ];
      @ViewChild(MatPaginator) paginator!: MatPaginator;
      @ViewChild(MatSort) sort!: MatSort;
      constructor(private marcaService: MarcaService, private _snackBar: MatSnackBar) {}


    ngOnInit(): void {
        this.marcaService.findAll().subscribe(data=>{
          this.dataSource=new MatTableDataSource(data);
          this.dataSource.sort = this.sort;
          this.dataSource.paginator = this.paginator;
          this.createTable(data);
        });

    }

    createTable(marca: Marca[]){
        this.dataSource=new MatTableDataSource(marca);
        this.dataSource.sort = this.sort;
        this.dataSource.paginator = this.paginator;
    }

    getDisplayedColumns(){
        return this.displayedColumns.filter(d=>d.hide)
          .map(d=>d.def);
    }

    applyFilter(filter: any){
        this.dataSource.filter = filter.target.value.trim().toLowerCase();
    }

}
