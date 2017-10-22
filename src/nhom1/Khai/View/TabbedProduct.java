package nhom1.khai.view;

import javax.swing.JTabbedPane;

import nhom1.khai.view.book.TableBookPanel;
import nhom1.khai.view.moviedisc.TableMoviesPanel;
import nhom1.khai.view.musicdisc.TableMusicPanel;

@SuppressWarnings("serial")
public class TabbedProduct extends JTabbedPane {
	private TableBookPanel tableBookPanel;
	private TableMoviesPanel tableMoviesPanel; 
	private TableMusicPanel tableMusicPanel;
	
	public TabbedProduct() {
		
		tableBookPanel = new TableBookPanel();
		tableMoviesPanel = new TableMoviesPanel();
		tableMusicPanel = new TableMusicPanel();
		
		
		addTab("Sách", tableBookPanel);
		addTab("Đĩa phim",tableMoviesPanel);
		addTab("Đĩa nhạc",tableMusicPanel);
		
		
	}

	public TableBookPanel getTableBookPanel() {
		return tableBookPanel;
	}

	public void setTableBookPanel(TableBookPanel tableBookPanel) {
		this.tableBookPanel = tableBookPanel;
	}

	public TableMoviesPanel getTableMoviesPanel() {
		return tableMoviesPanel;
	}

	public void setTableMoviesPanel(TableMoviesPanel tableMoviesPanel) {
		this.tableMoviesPanel = tableMoviesPanel;
	}

	public TableMusicPanel getTableMusicPanel() {
		return tableMusicPanel;
	}

	public void setTableMusicPanel(TableMusicPanel tableMusicPanel) {
		this.tableMusicPanel = tableMusicPanel;
	}
	
}
