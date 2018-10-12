/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labMongoDB;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author sebvi
 */
public class FrameConsultas extends javax.swing.JFrame {

    /**
     * Creates new form FrameConsutas
     */
	
	DB db;
	DBCollection coleccionPeliculas;
	DBCollection coleccionProductoras;
	
    public FrameConsultas() {
    	try {

			MongoClient mongoClient = new MongoClient("localhost", 27017);

			DB db = mongoClient.getDB("BasePelis");

			coleccionPeliculas = db.getCollection("Peliculas");
			coleccionProductoras = db.getCollection("Productoras");

			} catch (UnknownHostException ex) {
				System.out.println("Exception al conectar al server de Mongo: " + ex.getMessage());
			}
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        peliculaConsultar = new javax.swing.JTextField();
        franquiciaBuscar = new javax.swing.JTextField();
        botonConsultarPelicula = new javax.swing.JButton();
        botonConsultarFranquicia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadosConsultas = new javax.swing.JTextArea();
        anoInicial = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        anoFinal = new javax.swing.JTextField();
        botonRangoEstrenos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        productoraAbuscar = new javax.swing.JTextField();
        botonConsultarProductora = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        productoraEstadisticas = new javax.swing.JTextField();
        botonEstadisticas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        peliculaConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peliculaConsultarActionPerformed(evt);
            }
        });

        botonConsultarPelicula.setText("CONSULTAR");
        botonConsultarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarPeliculaActionPerformed(evt);
            }
        });

        botonConsultarFranquicia.setText("CONSULTAR");
        botonConsultarFranquicia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarFranquiciaActionPerformed(evt);
            }
        });

        resultadosConsultas.setColumns(20);
        resultadosConsultas.setRows(5);
        jScrollPane1.setViewportView(resultadosConsultas);

        jLabel1.setText("Película a buscar:");

        jLabel2.setText("Franquicia a buscar:");

        jLabel3.setText("Películas en un rango:");

        botonRangoEstrenos.setText("CONSULTAR");
        botonRangoEstrenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRangoEstrenosActionPerformed(evt);
            }
        });

        jLabel4.setText("Productora a buscar:");

        botonConsultarProductora.setText("CONSULTAR");
        botonConsultarProductora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarProductoraActionPerformed(evt);
            }
        });

        jLabel5.setText("Estadísticas de películas de una productora:");

        botonEstadisticas.setText("CONSULTAR");
        botonEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(peliculaConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(botonConsultarPelicula)))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(botonConsultarFranquicia))
                            .addComponent(franquiciaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(anoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anoFinal))
                            .addComponent(jLabel3)
                            .addComponent(botonRangoEstrenos))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(botonConsultarProductora)
                                        .addGap(125, 125, 125)
                                        .addComponent(botonEstadisticas))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(productoraAbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(productoraEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peliculaConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(franquiciaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoraAbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoraEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonConsultarPelicula)
                    .addComponent(botonConsultarFranquicia)
                    .addComponent(botonRangoEstrenos)
                    .addComponent(botonConsultarProductora)
                    .addComponent(botonEstadisticas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void peliculaConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peliculaConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_peliculaConsultarActionPerformed

    private void botonConsultarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarPeliculaActionPerformed
    	  franquiciaBuscar.setText("");
    	  anoInicial.setText("");
    	  anoFinal.setText("");
    	  productoraAbuscar.setText("");
    	  productoraEstadisticas.setText("");
    	BasicDBObject doc = new BasicDBObject(); 
          doc.put("nombre", peliculaConsultar.getText());
          String resultados = "";
          if (doc!=null) {
          	DBCursor cursor = coleccionPeliculas.find(doc);
          	while (cursor.hasNext()) {
          		DBObject cursor2 = cursor.next();
          		resultados += "\nNombre: " + cursor2.get("nombre") + "\nGénero: " + cursor2.get("genero");
          		resultados += "\nDirector: " + cursor2.get("director") + "\nFranquicia: " + cursor2.get("franquicia");
          		resultados += "\nPaís: " + cursor2.get("pais") + "\nAño: " + cursor2.get("ano");
          		resultados += "\nDuración: " + cursor2.get("duracion") + "\nProductora: " + cursor2.get("productora");
          		resultados += "\nActores: " + cursor2.get("actores");
          	} 	
          }
          resultadosConsultas.setText(resultados);
          resultadosConsultas.setEditable(false);
    }//GEN-LAST:event_botonConsultarPeliculaActionPerformed

    private void botonConsultarFranquiciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarFranquiciaActionPerformed
  	  anoInicial.setText("");
  	  anoFinal.setText("");
  	  productoraAbuscar.setText("");
  	  productoraEstadisticas.setText("");
  	  peliculaConsultar.setText("");
    	BasicDBObject doc = new BasicDBObject();
      doc.put("franquicia", franquiciaBuscar.getText());
      String resultados = "";
      if (doc!=null) {
      	DBCursor cursor = coleccionPeliculas.find(doc);
      	while (cursor.hasNext()) {
      		resultados = resultados + "\n\n" + (cursor.next().toString());
      	}
	    resultadosConsultas.setText(resultados);	
      } 
      resultadosConsultas.setEditable(false);
    }//GEN-LAST:event_botonConsultarFranquiciaActionPerformed

    private void botonConsultarProductoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarProductoraActionPerformed
    	  anoInicial.setText("");
      	  anoFinal.setText("");
      	  franquiciaBuscar.setText("");
      	  productoraEstadisticas.setText("");
      	  peliculaConsultar.setText("");  
    	BasicDBObject doc = new BasicDBObject();
          doc.put("productora", productoraAbuscar.getText());
          String resultados = "";
          System.out.println("hola");
          if (doc!=null) {
          	DBCursor cursor = coleccionPeliculas.find(doc);
          	while (cursor.hasNext()) {
          		DBObject cursor2 = cursor.next();
          		resultados = resultados + "\n\n" + "Nombre: " + cursor2.get("nombre").toString();
          		resultados += "\nGénero: " +  cursor2.get("genero");
          		resultados += "\nAño: " + cursor2.get("ano");
          	}
          resultadosConsultas.setText(resultados);	
          }
          resultadosConsultas.setEditable(false);
    }//GEN-LAST:event_botonConsultarProductoraActionPerformed

    private void botonRangoEstrenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRangoEstrenosActionPerformed
    	  productoraAbuscar.setText("");
      	  productoraEstadisticas.setText("");
      	  peliculaConsultar.setText("");
    	  franquiciaBuscar.setText("");
    	DBCursor cursor = coleccionPeliculas.find(new BasicDBObject("ano", new BasicDBObject("$gte", Integer.parseInt(anoInicial.getText())).append("$lte", Integer.parseInt(anoFinal.getText()))));
        String resultados = "";
    	while (cursor.hasNext()) {
        	resultados = resultados + "\n\n" + (cursor.next().toString());
        }
	    resultadosConsultas.setText(resultados);
        resultadosConsultas.setEditable(false);
    }//GEN-LAST:event_botonRangoEstrenosActionPerformed

    private void botonEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstadisticasActionPerformed
        //Cantidad de películas
    	  anoInicial.setText("");
      	  anoFinal.setText("");
      	  productoraAbuscar.setText("");
      	  peliculaConsultar.setText("");
      	  peliculaConsultar.setText("");
    	String resultados = "";
    	BasicDBObject doc1 = new BasicDBObject();
        doc1.put("productora", productoraEstadisticas.getText());
        DBCursor cursorX = coleccionPeliculas.find(doc1);;
        int cantidad = 0;
        while (cursorX.hasNext()) {
        	System.out.println(cursorX.next().get("nombre"));
        	cantidad++;
        }
        resultados = resultados + "\n Cantidad de películas: " + cantidad; 
    	
    	ArrayList<Integer> duracion = new ArrayList<Integer>();
          DBCursor cursor = coleccionPeliculas.find(doc1);
          while (cursor.hasNext()) {
          	duracion.add((Integer)cursor.next().get("duracion"));
          }
          Integer min = Collections.min(duracion);
          Integer max = Collections.max(duracion);
          
          BasicDBObject doc = new BasicDBObject();
          doc.put("duracion", min);
          resultados = resultados + "\n\n Película con menor duración: ";
          if (doc!=null) {
          	DBCursor cursor2 = coleccionPeliculas.find(doc);
          	while (cursor2.hasNext()) {
          		DBObject cursor5 = cursor2.next();
          		resultados = resultados + cursor5.get("nombre").toString() + " (" + cursor5.get("duracion").toString() + " minutos) ";
          	}  	
          }
          
          BasicDBObject doc2 = new BasicDBObject();
          doc2.put("duracion", max);
          resultados = resultados + "\n\n Película con mayor duración: ";
          if (doc2!=null) {
          	DBCursor cursor3 = coleccionPeliculas.find(doc2);
          	while (cursor3.hasNext()) {
          		DBObject cursor4 = cursor3.next();
          		resultados = resultados + cursor4.get("nombre").toString() + " (" + cursor4.get("duracion").toString() + " minutos) ";
          	}  	
          }
          

          int duracionTotal = 0;
          int duracionPromedio = 0;
          if (doc1!=null) {
          	DBCursor cursor6 = coleccionPeliculas.find(doc1);
          	while (cursor6.hasNext()) {
          		duracionTotal = duracionTotal + (Integer)cursor6.next().get("duracion");
          	}
          	System.out.println(cantidad);
          	System.out.println(duracionTotal);
          	if (cantidad!=0) {
          		duracionPromedio = duracionTotal/cantidad;
          	}
          	System.out.println(duracionPromedio);
          	resultados = resultados + "\n\n Duración promedio: " + duracionPromedio + " minutos";
          } 
        resultadosConsultas.setText(resultados);
        resultadosConsultas.setEditable(false);
        
        
        
      
    
          

          

    }//GEN-LAST:event_botonEstadisticasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anoFinal;
    private javax.swing.JTextField anoInicial;
    public static javax.swing.JButton botonConsultarFranquicia;
    public static javax.swing.JButton botonConsultarPelicula;
    public static javax.swing.JButton botonConsultarProductora;
    private javax.swing.JButton botonEstadisticas;
    private javax.swing.JButton botonRangoEstrenos;
    private javax.swing.JTextField franquiciaBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField peliculaConsultar;
    private javax.swing.JTextField productoraAbuscar;
    private javax.swing.JTextField productoraEstadisticas;
    public static javax.swing.JTextArea resultadosConsultas;
    // End of variables declaration//GEN-END:variables
}