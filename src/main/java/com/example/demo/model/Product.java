@Entity
@Bulider
@Getter @Setter
@NOArgsConstructor @AllArgsConstructor
@Table(name ="products", 
uniqueConstraints = {
    @UniqueConstraint(columnNames = "sku")

})
public class Product{
    @Id
    @GeneratedValue(startegy= GeneratedValue(strategy = GenerationType.IDENTITY))
    private Long id;
    @Column(nullable =false)
}