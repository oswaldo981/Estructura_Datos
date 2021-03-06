package segunda_unidad;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class menu_lista_doble {

	private JFrame frame;
	private JPanel ingresar;
	private JTextField artista;
	private JTextField nombre;
	private JTextField album;
	private JTextField id;
	private JTextField genero;
	private JButton  ingresar_principio;
	private JButton ingresar_final;
	lista_doble lista=new lista_doble();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu_lista_doble window = new menu_lista_doble();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu_lista_doble() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 653, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 ingresar = new JPanel();
		 ingresar.setBorder(new LineBorder(new Color(0, 0, 0)));
		 ingresar.setBounds(186, 50, 441, 349);
		frame.getContentPane().add(ingresar);
		ingresar.setLayout(null);
		
		artista = new JTextField();
		artista.setBounds(177, 98, 171, 20);
		ingresar.add(artista);
		artista.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Genero");
		lblNewLabel.setBounds(29, 70, 100, 14);
		ingresar.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Artista");
		lblNewLabel_1.setBounds(29, 101, 46, 14);
		ingresar.add(lblNewLabel_1);
		
		JLabel lblNombreDeCancin = new JLabel("Nombre de Canci\u00F3n");
		lblNombreDeCancin.setBounds(29, 132, 138, 14);
		ingresar.add(lblNombreDeCancin);
		
		JLabel lblAlbum = new JLabel("Album");
		lblAlbum.setBounds(29, 169, 46, 14);
		ingresar.add(lblAlbum);
		
		JLabel lblIdCancin = new JLabel("ID canci\u00F3n");
		lblIdCancin.setBounds(29, 206, 100, 14);
		ingresar.add(lblIdCancin);
		
		nombre = new JTextField();
		nombre.setBounds(177, 129, 171, 20);
		ingresar.add(nombre);
		nombre.setColumns(10);
		
		album = new JTextField();
		album.setColumns(10);
		album.setBounds(177, 166, 171, 20);
		ingresar.add(album);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(177, 203, 171, 20);
		ingresar.add(id);
		
		genero = new JTextField();
		genero.setBounds(177, 67, 171, 20);
		ingresar.add(genero);
		genero.setColumns(10);
		
		JButton btnAceptar_in_p = new JButton("Aceptar");
		btnAceptar_in_p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				musica valor=new musica();
				nodo_m llenar=new nodo_m();
				String album_,genero_,artista_,nombre_,id_;
				valor.setAlbum(album.getText());		
				valor.setGenero(genero.getText());
				valor.setArtista(artista.getText());
				valor.setCancion(nombre.getText());
				valor.setId(id.getText());
			
				
				lista.insertar_inicio(valor);
				JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
				album.setText(null);
				genero.setText(null);
				artista.setText(null);
				nombre.setText(null);
				id.setText(null);
			}
		});
		btnAceptar_in_p.setBounds(29, 291, 166, 23);
		ingresar.add(btnAceptar_in_p);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(265, 291, 166, 23);
		ingresar.add(btnCancelar);
		
		JLabel lblING = new JLabel("I N G R E S A R ");
		lblING.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblING.setHorizontalAlignment(SwingConstants.CENTER);
		lblING.setBounds(66, 11, 282, 31);
		ingresar.add(lblING);
		
		JButton aceptar_final = new JButton("Aceptar");
		aceptar_final.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				musica valor=new musica();
				nodo_m llenar=new nodo_m();
				String album_,genero_,artista_,nombre_,id_;
				valor.setAlbum(album.getText());		
				valor.setGenero(genero.getText());
				valor.setArtista(artista.getText());
				valor.setCancion(nombre.getText());
				valor.setId(id.getText());	
				lista.insertarFinal(valor);
				JOptionPane.showMessageDialog(null, "Datos insertados correctamente");
				album.setText(null);
				genero.setText(null);
				artista.setText(null);
				nombre.setText(null);
				id.setText(null);
			}
		});
		aceptar_final.setBounds(29, 291, 166, 23);
		ingresar.add(aceptar_final);
		
		 ingresar_principio = new JButton("Ingresar Principio");
		ingresar_principio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnAceptar_in_p.setVisible(true);
				ingresar_principio.setBackground(Color.GREEN);
				ingresar_final.setBackground(Color.WHITE);
				aceptar_final.setVisible(false);
			}
		});
		ingresar_principio.setBounds(10, 86, 166, 23);
		frame.getContentPane().add(ingresar_principio);
		
		 ingresar_final = new JButton("Ingresar Final");
		ingresar_final.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnAceptar_in_p.setVisible(false);
				ingresar_final.setBackground(Color.GREEN);
				ingresar_principio.setBackground(Color.WHITE);
				aceptar_final.setVisible(true);
				
			}
		});
		ingresar_final.setBounds(10, 138, 166, 23);
		frame.getContentPane().add(ingresar_final);
		
		JButton borrarP = new JButton("Borrar Principio");
		borrarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				if(lista.eliminar_principio())
				{
					JOptionPane.showMessageDialog(null, "Datos Eliminados");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "NO existen datos a eliminar");
				}
				}
				catch(NullPointerException e)
				{
					JOptionPane.showMessageDialog(null, "NO existen datos para eliminar");
				}
			}
		});
		borrarP.setBounds(10, 186, 166, 23);
		frame.getContentPane().add(borrarP);
		
		JButton borrar_final = new JButton("Borrar Final");
		borrar_final.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(null, lista.contar());
				try{
					if(lista.eliminar_final())
					{
						JOptionPane.showMessageDialog(null, "Datos Eliminados");
					}
					else {
						JOptionPane.showMessageDialog(null, "NO existen datos a eliminar");
					}
				}
				catch(NullPointerException e)
				{
					JOptionPane.showMessageDialog(null, "NO existen datos para eliminar");
				}
				
			}
		});
		borrar_final.setBounds(10, 236, 166, 23);
		frame.getContentPane().add(borrar_final);
		
		JButton imprimir_a = new JButton("Imprimir Atras");
		imprimir_a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,lista.imprimir_anterior());
			}
		});
		imprimir_a.setBounds(10, 287, 166, 23);
		frame.getContentPane().add(imprimir_a);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, lista.imprimir());
			}
		});
		btnImprimir.setBounds(10, 336, 166, 23);
		frame.getContentPane().add(btnImprimir);
		
		JLabel lblListasDoblementeEnlazadas = new JLabel("Listas Doblemente Enlazadas");
		lblListasDoblementeEnlazadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblListasDoblementeEnlazadas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblListasDoblementeEnlazadas.setBounds(144, 8, 324, 31);
		frame.getContentPane().add(lblListasDoblementeEnlazadas);
	}
}
